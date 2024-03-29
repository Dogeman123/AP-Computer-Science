package Prog7301m;

public class MultiLayerPerceptron {
    private double fLearningRate;
    private Layer[] fLayers;
    private Activations.Activation fActivation;

    public MultiLayerPerceptron(int[] layers, double learning_rate, Activations.Activation activation) {
        fLearningRate = learning_rate;
        fActivation = activation;
        fLayers = new Layer[layers.length];
        for (int i = 0; i < layers.length; i++)
            fLayers[i] = (i == 0) ? new Layer(layers[i], 0)
                    : new Layer(layers[i], layers[i-1]);
    }

    public double[] feedForward(double[] input) {
        double result;
        double[] output = new double[fLayers[fLayers.length-1].Size];

        for (int i = 0; i < fLayers[0].Size; i++) fLayers[0].Neurons[i].Value = input[i];
        for (int k = 1; k < fLayers.length; k++) {
            for (int i = 0; i < fLayers[k].Size; i++) {
                result = 0.0;
                for (int j = 0; j < fLayers[k-1].Size; j++)
                    result += fLayers[k].Neurons[i].Weights[j] * fLayers[k-1].Neurons[j].Value;
                result += fLayers[k].Neurons[i].Bias;
                fLayers[k].Neurons[i].Value = fActivation.activate(result);
            }
        }

        for (int i = 0; i < fLayers[fLayers.length-1].Size; i++)
            output[i] = fLayers[fLayers.length-1].Neurons[i].Value;
        return output;
    }

    public double[] predict(double[] input) { return feedForward(input); }

    public double accuracy(double[][] input, double[][] output) {
        double error = 0;
        for (int i = 0; i < input.length; i++) {
            double[] result = feedForward(input[i]);
            for (int j = 0; j < output[i].length; j++)
                error += Math.abs(result[j] - output[i][j]);
        }
        return 1 - error / (input.length * output[0].length);
    }

    public double backPropagate(double[] input, double[] output) {
        double[] result = feedForward(input);
        double error = 0.0;

        for (int i = 0; i < fLayers[fLayers.length-1].Size; i++) {
            error = output[i] - result[i];
            fLayers[fLayers.length-1].Neurons[i].Delta = error * fActivation.activateDeriv(result[i]);
        }

        for (int k = fLayers.length-2; k >= 0; k--) {
            for (int i = 0; i < fLayers[k].Size; i++) {
                error = 0;
                for (int j = 0; j < fLayers[k+1].Size; j++)
                    error += fLayers[k+1].Neurons[j].Delta * fLayers[k+1].Neurons[j].Weights[i];
                fLayers[k].Neurons[i].Delta = error *
                        fActivation.activateDeriv(fLayers[k].Neurons[i].Value);
            }
            for (int i = 0; i < fLayers[k+1].Size; i++) {
                for (int j = 0; j < fLayers[k].Size; j++)
                    fLayers[k+1].Neurons[i].Weights[j] += fLearningRate *
                            fLayers[k+1].Neurons[i].Delta * fLayers[k].Neurons[j].Value;
                fLayers[k+1].Neurons[i].Bias += fLearningRate * fLayers[k+1].Neurons[i].Delta;
            }
        }

        error = 0.0;
        for (int i = 0; i < output.length; i++) error += Math.abs(result[i]-output[i]);
        error /= output.length;
        return error;
    }

    public void train(double[][] X_train, double[][] y_train, int epochs) {
        for (int epoch = 0; epoch < epochs; epoch++) {
            double loss = 0;
            for (int i = 0; i < X_train.length; i++)
                loss += backPropagate(X_train[i], y_train[i]);
            loss /= X_train.length;
            System.out.printf("Epoch %d:\tLoss: %.6f\t\tAccuracy: %.6f\n",
                    (epoch+1), loss, accuracy(X_train, y_train));
        }

    }
}