
void setup() {
  size(1000,500);
   
}
int x1 = 250;
int x2 = 750;
void draw() {
   int size = 400 ;
   for(int i = 8; i>0; i--){
   noFill();
    ellipse(x1,250,size,size);
    size-=50;
   }
    size = 400 ;
 for(int i = 8; i>0; i--){
   noFill();
    ellipse(x2,250,size,size);
    size-=50;
  }
  x1 += 1;
  x2 -= 1;
  
  // Go to the recipe to run the demonstration before starting this program
  
  /*
  Use the code from your Bullseye program to draw the rings shown in this recipe.
  You can use the noFill() command to make your ellipses transparent.
  Make the rings move past each other.
  When the rings hit the side of the sketch, make them reverse their direction.
  */
}
