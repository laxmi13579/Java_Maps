package test;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.core.Coordinate;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.providers.OpenStreetMap;
import de.fhpotsdam.unfolding.providers.StamenMapProvider;
import processing.core.*;

public class unfoldingMapsProgram extends PApplet {
	
	// You can ignore this.  It's to keep eclipse from generating a warning.
	private static final long serialVersionUID = 1L;
	private UnfoldingMap map;
	
	//This is where to find the local tiles, for working without an Internet connection 
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	public static boolean offline = true;
	
	public void setup() {
		//set size of PApplet
		size(500,500);
		if(offline) {
			//new UnfoldingMap(processing.core.PApplet p,x,y,width,height, AbstractMapProvider provider);
			map = new UnfoldingMap(this,50,50,500,500,new MBTilesMapProvider(mbTilesString));
		}else {
			//Google Maps
//			map = new UnfoldingMap(this, 50,50,300,300, new Google.GoogleMapProvider());
//			map = new UnfoldingMap(this, 50,50,500,500, new Google.GoogleTerrainProvider());
//			map = new UnfoldingMap(this, 50,50,500,500, new Google.GoogleSimplified2Provider());



			//Microsoft Maps
//			map = new UnfoldingMap(this, 50,50,500,500, new Microsoft.AerialProvider());
//			map = new UnfoldingMap(this, 50,50,500,500, new Microsoft.HybridProvider());
			map = new UnfoldingMap(this, 50,50,500,500, new Microsoft.RoadProvider());

			//OpenStreet Maps
//			map = new UnfoldingMap(this, 50,50,500,500, new OpenStreetMap.OpenStreetMapProvider());
			
			//Stamen Maps
//			map = new UnfoldingMap(this, 50,50,500,500, new StamenMapProvider.WaterColor());
//			map = new UnfoldingMap(this, 50,50,500,500, new StamenMapProvider.Toner());
//			map = new UnfoldingMap(this, 50,50,500,500, new StamenMapProvider.TonerLite());
//			map = new UnfoldingMap(this, 50,50,500,500, new StamenMapProvider.TonerBackground());




		}
		
	}
	public void draw() {
		
		map.draw();
	}
}
