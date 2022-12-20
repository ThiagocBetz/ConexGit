public class Fatura {
	
	private int faturaId;
	private int mesAno;
	private Uc unidadeConsumidora;
	private int consumo;
	private boolean pago;
	
		public int getFaturaId() {
			return faturaId;
		}
		public void setFaturaId(int faturaId) {
			this.faturaId = faturaId;
		}
		public int getMesAno() {
			return mesAno;
		}
		public void setMesAno(int mesAno) {
			this.mesAno = mesAno;
		}
		public Uc getUnidadeConsumidora() {
			return unidadeConsumidora;
		}
		public void setUnidadeConsumidora(Uc unidadeConsumidora) {
			this.unidadeConsumidora = unidadeConsumidora;
		}
		public int getConsumo() {
			return consumo;
		}
		public void setConsumo(int consumo) {
			this.consumo = consumo;
		}
		public boolean isPago() {
			return pago;
		}
		public void setPago(boolean pago) {
			this.pago = pago;
		}
		public double ValorFatura() {
			
			return 0;
		}
		public void imprimirFatura(Fatura vetor[]) {
			
		}
}