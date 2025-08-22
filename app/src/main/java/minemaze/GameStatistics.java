package minemaze;

public class GameStatistics {
    private int pusherMoves;
    private int pusherFuelUsed;
    private int bomberMoves;
    private int bomberFuelUsed;
    private int bombsPlaced;
    private int rocksDestroyed;
    private int boostersUsed;
    
    public GameStatistics() {
        reset();
    }
    
    public void reset() {
        pusherMoves = 0;
        pusherFuelUsed = 0;
        bomberMoves = 0;
        bomberFuelUsed = 0;
        bombsPlaced = 0;
        rocksDestroyed = 0;
        boostersUsed = 0;
    }
    
    public void recordPusherMove(int fuelConsumed) {
        pusherMoves++;
        pusherFuelUsed += fuelConsumed;
    }
    
    public void recordBomberMove(int fuelConsumed) {
        bomberMoves++;
        bomberFuelUsed += fuelConsumed;
    }
    
    public void recordBombPlaced() {
        bombsPlaced++;
    }
    
    public void recordRockDestroyed() {
        rocksDestroyed++;
    }
    
    public void recordBoosterUsed() {
        boostersUsed++;
    }
    
    public int getPusherMoves() { return pusherMoves; }
    public int getPusherFuelUsed() { return pusherFuelUsed; }
    public int getBomberMoves() { return bomberMoves; }
    public int getBomberFuelUsed() { return bomberFuelUsed; }
    public int getBombsPlaced() { return bombsPlaced; }
    public int getRocksDestroyed() { return rocksDestroyed; }
    public int getBoostersUsed() { return boostersUsed; }
    
    public String generateReport() {
        StringBuilder report = new StringBuilder();
        report.append("Pusher-1 Moves: ").append(pusherMoves).append("\n");
        report.append("Pusher-1 Fuel used: ").append(pusherFuelUsed).append("\n");
        if (bomberMoves > 0) {
            report.append("Bomber-1 Moves: ").append(bomberMoves).append("\n");
            report.append("Bomber-1 Fuel used: ").append(bomberFuelUsed).append("\n");
        }
        report.append("Bombs placed: ").append(bombsPlaced).append("\n");
        report.append("Rocks broken: ").append(rocksDestroyed).append("\n");
        report.append("Boosters used: ").append(boostersUsed);
        return report.toString();
    }
}