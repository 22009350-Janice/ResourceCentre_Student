
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = super.toString();
		
		// Write your codes here
		output = String.format("%-63s %-20d", output, opticalZoom);
		return output;
	}
}
