public interface GeometryAction {
    void move(double dx, double dy);
    void resize(double coefficient);
    double calcArea();
    void printPosition();
}
