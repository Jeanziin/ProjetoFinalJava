public class Cano {
	
	public double x,y;
	
	public static int xspeed = -100;
	public static int HOLESIZE = 94; 
	public boolean counted = false;
	
	public Hitbox boxcima;
	public Hitbox boxbaixo;
	

	public Cano(double x, double y){
		this.x = x;
		this.y = y;
		this.boxcima = new Hitbox(x, y-270-220 ,x+52 ,y);
		this.boxbaixo = new Hitbox(x, y+HOLESIZE, x+52, y+HOLESIZE+442);
	}
	
	public void tique(double dt){
		x += xspeed*dt;
		boxcima.mover(xspeed*dt, 0);
		boxbaixo.mover(xspeed*dt, 0);
	}
	public void drawItself(Tela t){
		t.imagem("flappy.png", 660, 0, 52, 242, 0, x, y + HOLESIZE); //cano virado pra cima
		t.imagem("flappy.png", 660, 42, 52, 200, 0, x, y + HOLESIZE + 242); //resto do cano virado pra cima
		
		t.imagem("flappy.png", 604, 0, 52, 270, 0, x, y - 270); //cano virado pra baixo
		t.imagem("flappy.png", 604, 0, 52, 220, 0, x, y - 270 - 220); //resto do cano virado pra baixo
	}
}
