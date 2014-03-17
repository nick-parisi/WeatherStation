import java.awt.Color;


public class ComponentStyleFactory {
	
	private ComponentStyleFactory(){}
	
	public static ComponentStyleFactory instance(){
		return new ComponentStyleFactory();
	}
	
	public DualColor create(Color border, Color background){
		return new DualColor(border, background);
	}
	
	public MonoChrome createMonochrome(Color border){
		return new MonoChrome(border);
	}

}
