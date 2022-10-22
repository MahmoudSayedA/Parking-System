
public enum Color {
    RED, BLUE, GREEN, YELLOW, BLACK, WHITE, BINK, GOLD,
    SELVER,GRAY, BROWN, MIX;
    
    public String toString() {
        if(this == RED)
            return "red";
        else if (this == BINK) {
            return "bink";
        }
        else if (this == YELLOW) {
            return "yellow";
        }
        else if (this == BLACK) {
            return "black";
        }
        else if (this == WHITE)
            return "white";
        else if (this == GOLD)
            return "gold";
        else if (this == BLUE)
            return "blue";
        else if(this == SELVER)
            return "selver";
        else if(this==GRAY)
            return "gray";
        else if(this==BROWN)
            return "brown";
        else {
            return "mix";
        }
    }
}
