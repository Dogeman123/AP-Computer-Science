package Prog7301m;

import java.time.chrono.JapaneseChronology;

public class Layer {
    class Neuron{
        public double Value; // a_i^(L)
        public double[] weights;
        public double bias;
        public double Delta;

        public Neuron(int prevLayerSize){
            weights = new double[prevLayerSize];
            bias = Math.random() - 0.5;
            Delta = Math.random() - 0.5;
            Value = Math.random() - 0.5;
            for(int i = 0; i < weights.length; i++){
                weights[i] = Math.random() - 0.5;
            }
        }
        public Neuron[] Neurons;
        public int size;

        public Layer(int neurons, int prev){
            Size = neurons;
            Neurons = new Neuron[neurons];
            for(int i = 0 ; i < size; i++){
                Neurons[i] = new Neuron(prev);
            }
        }
    }
}
