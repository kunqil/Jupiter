package recommendation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import db.mysql.MySQLConnection;
import entity.Item;

public class GeoRecommendation {
	  public List<Item> recommendItems(String userId, double lat, double lon) {
			List<Item> recommendedItems = new ArrayList<>();

			// Step 1, get all favorited itemids

			// Step 2, get all categories,  sort by count
			// {"sports": 5, "music": 3, "art": 2}
				

			// Step 3, search based on category, filter out favorite items
			
			return recommendedItems;
	  }


}
