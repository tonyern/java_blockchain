import java.util.ArrayList;

/**
 * Main class to test and run blockchain.
 * @author Tony Nguyen
 * @version 1.0
 *
 */
public class Main
{
    /**
     * Hash = digital signature
     * 
     * Each block will have:
     *     List of transactions
     *     Previous hash
     *     Its own hash
     * 
     */
    
    ArrayList<Block> blockChain = new ArrayList<>();
    
    public static void main(String[] args)
    {
        String[] transaction1 = {"Tony sent 10 btc to Jeff.", "Jeff sent 25 btc to Tony."};
        Block block1 = new Block(0, transaction1);
        
        String[] transaction2 = {"Satashi sent 10000000000 btc to Tony.", "Tony sent 1000 btc to Loi."};
        Block block2 = new Block(block1.getBlockHash(), transaction2);
        
        System.out.println("Block1 Hash: " + block1.getBlockHash());
        System.out.println("Block2 Hash: " + block2.getBlockHash());
    }

}
