import java.util.Arrays;

/**
 * Individual block or node that contains data and references to the next block in the chain.
 * @author Tony Nguyen
 *
 */
public class Block
{
    private int previousHash;
    private String[] transaction;
    
    private int blockHash;
    
    /*
     * Constructor of Block.
     */
    public Block(int previousHash, String[] transaction)
    {
        this.previousHash = previousHash;
        this.transaction = transaction;
        
        Object[] contentObjects = {Arrays.hashCode(transaction), previousHash};
        this.blockHash = Arrays.hashCode(contentObjects);
    }
    
    public int getPreviousHash()
    {
        return previousHash;
    }
    
    public String[] getTransaction()
    {
        return transaction;
    }
    
    public int getBlockHash()
    {
        return blockHash;
    }
}
