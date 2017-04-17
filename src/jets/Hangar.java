package jets;

public class Hangar {
		String model;
		int speedMph;
		int speedMach;
		int price;
		int range;
		
		protected Hangar(String model, int speedMph, int speedMach, int price, int range) {
			super();
			this.model = model;
			this.speedMph = speedMph;
			this.speedMach = speedMach;
			this.price = price;
			this.range = range;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getSpeedMph() {
			return speedMph;
		}

		public void setSpeedMph(int speedMph) {
			this.speedMph = speedMph;
		}

		public int getSpeedMach() {
			return speedMach;
		}

		public void setSpeedMach(int speedMach) {
			this.speedMach = speedMach;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getRange() {
			return range;
		}

		public void setRange(int range) {
			this.range = range;
		}
		
}
