package Prog7301m;

public class MultiLayerPerceptron {
    private double fLearningRate;
    private Layer[] flayers;
    private Activations.Activation fActivation;

    public MultiLayerPerceptron(int[] layers, double learning_rate,
                                Activations.Activation activation){
        fLearningRate = learning_rate;
        fActivation = activation;
        flayers = new Layer[layers.length];
        for(int i = 0; i < layers.length; i++){
            flayers[i] = (i == 0) ? new Layer(layers[i], 0)
                                  : new Layer(layers], layers[i-1]);
          }
        }
        public double[] feedForward(double[] input) {
            double result;
            double[] output = new double[flayers[flayers.length - 1].Size];

            for (int i = 0; i < flayers[0].Size; i++) flayers[0].Neurons[i].Value = input[i];
            for (int k = 1; k < flayers.length; k++) {
                for (int i = 0; i < flayers[k].Size; i++) {
                    result = 0.0;
                    for (int j = 0; j < flayers[k - 1].Size; j++) {
                        result += flayers[k].Neurons[i].Weights[j] * flayers[k - 1].Neurons[j].Value;
                        result += flayers[k].Neurons[i].Bias;
                        flayers[k].Neurons[i].Value = fActivation.activate(result);
                    }
                }
                for (int i = 0; i < flayers[flayers.length - 1].Size; i++) {
                    output[i] = flayers[flayers.length - 1].Neurons[i].Value;
                    return output;
                }
            }
        }
                public double[] predict ( double[] input){ return feedForward(input);}

                public double backPropagate(double[] input,double[] output){
        double[] result = feedForward(input);
        double error = 0.0;

        return error;
        }
        public void train(double[][] X_train, double[][] y_train, int epochs){
        for(int epoch = 0; epoch < epochs; epoch++){
            double loss = 0;
            for(int i = 0; i < X_train.length; i++){
                loss += backPropagate(X_train[i], y_train[i]);
                loss /= X_train.length;
                System.out.printf("Epoch %d:\tLoss: %.6f\t\tAccuracy: %.6f\n",
                        (epoch+1), loss,accuracy(X_train, y_train));
            }
           }
        }
}
