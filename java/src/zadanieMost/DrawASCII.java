package zadanieMost;

public class DrawASCII implements DrawAPI {

    static final String FULL = "XX";
    static final String EMPTY = "  ";

    @Override
    public void drawCircle(int x, int y, int radius) {
        StringBuilder builder = new StringBuilder();

        for (int currentY = 0; currentY <= y + radius; currentY++) {
            for (int currentX = 0; currentX <= x + radius; currentX++) {

                if (isInsideCircle(currentX, currentY, x, y, radius)) {
                    builder.append(FULL);
                } else {
                    builder.append(EMPTY);
                }
            }
            builder.append('\n');
        }

        System.out.println(builder);
    }

    private boolean isInsideCircle(int currentX, int currentY, int x, int y, int radius) {
        int xDistance = currentX <= x
                ? currentX - x
                : x - currentX;

        int yDistance = currentY <= y
                ? currentY - y
                : y - currentY;

        int distance = (int) Math.sqrt(xDistance * xDistance + yDistance * yDistance);


        return distance <= radius;
    }

    @Override
    public void drawRectangle(int x, int y, int width, int height) {
        StringBuilder builder = new StringBuilder();

        for (int currentY = 0; currentY <= y + height; currentY++) {
            for (int currentX = 0; currentX <= x + width; currentX++) {

                if (isInsideRectangle(currentX, currentY, x, y, width, height)) {
                    builder.append(FULL);
                } else {
                    builder.append(EMPTY);
                }

            }
            builder.append('\n');
        }

        System.out.println(builder);
    }

    private boolean isInsideRectangle(int currentX, int currentY, int x, int y, int width, int height) {
        boolean isInsideX = x <= currentX && currentX <= x + width;
        boolean isInsideY = y <= currentY && currentY <= y + height;

        return isInsideX && isInsideY;
    }


}
