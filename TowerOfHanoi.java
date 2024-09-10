
public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi puzzle
    public static void solve(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disks from source to auxiliary, using destination as a buffer
        solve(n - 1, source, destination, auxiliary);
        
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        
        // Move the n-1 disks from auxiliary to destination, using source as a buffer
        solve(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 6; // Number of disks
        solve(n, 'A', 'B', 'C'); // A, B, and C are the names of the rods
    }
}
