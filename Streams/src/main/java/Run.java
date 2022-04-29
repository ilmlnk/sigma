import controller.StreamController;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        System.out.println(StreamController.streamCapitalization("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent rhoncus pretium mauris, ut molestie ex auctor sed. Praesent blandit molestie urna sed hendrerit. " +
                "Sed at enim fringilla, vulputate diam in, pharetra ipsum. Mauris sed arcu felis. " +
                "Aenean vitae eros metus. Pellentesque ante augue, tincidunt non nulla at, condimentum " +
                "maximus enim. Sed blandit sollicitudin odio, ut luctus magna aliquet eget. Praesent " +
                "viverra justo eu velit suscipit congue maximus ut tortor. Sed at eros id sem sodales maximus."));

        System.out.println(StreamController.streamSortedSentences("Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Praesent rhoncus pretium mauris, ut molestie ex auctor sed. Praesent blandit molestie urna sed hendrerit. " +
                "Sed at enim fringilla, vulputate diam in, pharetra ipsum. Mauris sed arcu felis. " +
                "Aenean vitae eros metus. Pellentesque ante augue, tincidunt non nulla at, condimentum " +
                "maximus enim. Sed blandit sollicitudin odio, ut luctus magna aliquet eget. Praesent " +
                "viverra justo eu velit suscipit congue maximus ut tortor. Sed at eros id sem sodales maximus."));

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(6);
        integers.add(4);
        integers.add(-2);
        integers.add(-10);
        integers.add(-6);
        System.out.println(StreamController.streamSeparatedNumbers(integers));
    }
}
