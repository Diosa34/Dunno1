package object;

import abstracts.Direction;
import abstracts.RelativePlace;
import abstracts.RelativeSize;
import abstracts.Size;

public class Plants implements RelativeSize, RelativePlace {
    Direction direction;
    Size size;

    public Plants(Direction direction, Size size){
        this.direction = direction;
        this.size = size;
    }

    @Override
    public Direction getDirection(){
        return this.direction;
    };

    @Override
    public Size getSize(){
        return this.size;
    };
}
