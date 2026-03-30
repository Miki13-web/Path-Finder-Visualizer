package pathfinder.model;

public class GridMap {
    private Node[][] grid;
    private int width;
    private int height;

    public GridMap(int width, int height) {
        this.width = width;
        this.height = height;

        grid = new Node[width][height];

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                 grid[i][j] = new Node(i, j);
            }
        }
    }
}
