package this_vs_super;

class BadRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public BadRectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }

    public BadRectangle(int width, int height) {
        this.x = 0;
        this.y = 0;
        this.width = width;
        this.height = height;
    }

    public BadRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

class GoodRectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public GoodRectangle() {
        this(0, 0, 0, 0);
    }

    public GoodRectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public GoodRectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
