
public class IMC {
	
		private double peso=0;
		private double altura=0;
		private double imc=0;
		
		public IMC (double p, double a){
			
			this.peso=p;
			this.altura=a;
		}

		public boolean pesoValido(){
			if (this.peso > 0){
				return true;
			}else {
				return false;
			}
			
		}
		
		public boolean alturaValida(){
			if (this.altura > 0){
				return true;
			}else {
				return false;
			}
			
		}
		
		public double calculaImc(){
			imc= this.peso / (this.altura * this.altura);
			return imc;
		}


		
	}
	
