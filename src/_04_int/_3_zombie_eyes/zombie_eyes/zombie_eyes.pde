
void setup() {
PImage face = loadImage("Dave-.jpg");
size(649, 433);
face.resize(649, 433);
image(face, 0, 0);
}
void draw() {
  fill(mouseX, 0, mouseY);
ellipse(337, 138, 26, 11);
ellipse(260, 157, 21, 11);
fill(0);
ellipse(337, 138, 8, 8);
ellipse(260, 157, 8, 8);
}
