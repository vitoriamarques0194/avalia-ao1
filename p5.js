
let olhoX = 250;
let olhoY = 200;

function draw() {
  background(255,120,100);

  // rosto
  fill(80,180,250);
  circle(200,200,300);

  // olho esquerdo
  fill(255);
  circle(150,160,60);
  fill(0);
  circle(150 + (mouseX-200)*0.05, 160 + (mouseY-200)*0.05, 20);

  // olho direito
  fill(255);
  circle(250,160,60);
  fill(0);
  circle(250 + (mouseX-200)*0.05, 160 + (mouseY-200)*0.05, 20);
}
