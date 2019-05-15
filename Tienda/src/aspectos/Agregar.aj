package aspectos;

public aspect Agregar {

String consulta = "se agrego una categoria";

	
	pointcut metodo() : call(public * agregar*(..));
	

	

	// advice
	after() : metodo(){
		System.out.println(consulta);
	}
	
}