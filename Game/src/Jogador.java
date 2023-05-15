
public class Jogador {

	String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	public Jogador() {
		this.nome="anonimo";
		this.xp= 5;
		this.hp= 100;
		this.envenenado= false;
		
		
	}
	
	public Jogador(String nome) {
		System.out.println("Criando o Jogador" + nome);
		this.nome=nome;
		
		}
	
	public void receberDano (int pontos) {
		
		hp-= pontos;
	}
	public void receberCura(int pontos) {
		hp+= pontos;
		
	}
	
	public String getNome() {
		return nome;
		
	}

	public int getXp() {
		return xp;
	}

	public int getHp() {
		return hp;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	
	
	
		
}

