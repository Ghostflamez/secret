package minemaze;
import ch.aplu.jgamegrid.*;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGrid
{
  private int nbHorzCells = 20;
  private int nbVertCells = 11;
  private MineMaze.ElementType[][] mapElements; // = new MineMaze.ElementType[nbHorzCells][nbVertCells];
  private int numberOfTargets = 0;
  private final String map =
    "    xxxxx           " + // 0 (19)
    "    x...x           " + // 1
    "    x...x           " + // 2
    "  xxx..Bxx          " + // 3
    "  x......xxxxxxxxxxx" + // 4
    "xxx....h..........ox" + // 5
    "x....r.........r..ox" + // 6
    "x............h....ox" + // 7
    "xxxxx.....xPxx....ox" + // 8
    "    x.....xxxxxxxxxx" + // 9
    "    xxxxxxx         ";  //10

  public MapGrid()
  {
    mapElements = new MineMaze.ElementType[nbHorzCells][nbVertCells];
    Map<Character, MineMaze.ElementType> elementTypeMap = Arrays.stream(MineMaze.ElementType.values())
            .collect(Collectors.toMap(MineMaze.ElementType::getMapElement, element -> element));
    // Copy structure into integer array
    for (int k = 0; k < nbVertCells; k++)
    {
      for (int i = 0; i < nbHorzCells; i++)
      {
        mapElements[i][k] = elementTypeMap.get(map.charAt(nbHorzCells * k + i));
        if (mapElements[i][k] == MineMaze.ElementType.TARGET) {
          numberOfTargets ++;
        }
      }
    }
  }

  public int getNbHorzCells()
  {
    return nbHorzCells;
  }

  public int getNbVertCells()
  {
    return nbVertCells;
  }

  public int getNumberOfTargets() { return numberOfTargets; }

  public MineMaze.ElementType getCell(Location location)
  {
    return mapElements[location.x][location.y];
  }
}
