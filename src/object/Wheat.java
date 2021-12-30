package object;

import abstracts.Direction;
import abstracts.Forest;
import abstracts.Size;

public class Wheat extends Plants implements Forest {
    Wheat(Direction direction, Size size){
        super(direction, size);
    }
}
