import searchmorethanaverage.AverageSearcher;
import sentences.SentenceProcessing;
import swapminmax.Swapping;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
    public static void main(String[] args) {
        /* swap min and max */
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(5, 6, 10, -10, 60, 8));
        System.out.println(AverageSearcher.defineGreaterThanAverage(integerArrayList));

        /* average */
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(10, 20, 1, 2, 3));
        System.out.println(Swapping.swapMinMax(integers));

        /* sentence processing */
        System.out.println(SentenceProcessing.subtractionVowelsAndConsonants("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi a lorem eget magna semper tempor. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Proin eu nunc id magna interdum convallis eget non eros. Aliquam ultricies, sem eu vehicula dapibus, mi leo ornare odio, tincidunt placerat metus nulla eu leo. Interdum et malesuada fames ac ante ipsum primis in faucibus. Maecenas volutpat ut eros sit amet vehicula. Nullam ex diam, bibendum mollis dolor in, vestibulum faucibus massa. Cras vitae purus fermentum, auctor erat vitae, rhoncus libero. Donec in magna sed ex luctus tempus. Vestibulum lacinia lorem vitae odio aliquet, ac suscipit lorem aliquam.\n" +
                "\n" +
                "Morbi erat purus, bibendum sit amet suscipit sed, mollis a nibh. Morbi sed elit enim. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Morbi malesuada vehicula tellus nec sagittis. Vivamus iaculis accumsan odio in rutrum. Cras fermentum sit amet diam et pellentesque. Sed ac justo finibus, porttitor nibh vel, tempus justo. Nullam rutrum orci nisl, vitae convallis libero efficitur at. Donec quis odio pharetra, lobortis elit id, scelerisque massa. Praesent rutrum ultricies elit vel varius.\n" +
                "\n" +
                "Etiam in finibus nisi, ac mattis quam. Donec aliquet ligula purus, non tempus ligula pulvinar eu. Suspendisse quis quam convallis, accumsan ante vitae, suscipit sapien. Curabitur eget nulla nibh. Nulla dictum rutrum consectetur. Donec vitae enim nisi. Integer fringilla interdum justo, eu scelerisque ipsum malesuada congue. Etiam quis turpis vitae dui fringilla semper. Fusce ac magna nunc. Integer consectetur dolor vitae porttitor finibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
    }
}
