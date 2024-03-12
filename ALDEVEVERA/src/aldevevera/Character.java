
package aldevevera;


class Character {
    
    private int health;
    private int damage;
    private int shield;     
    
    
     Character (int health, int damage, int shield){
        this.health = health;
        this.damage = damage;
        this.shield = shield;
    }
    
    public int getHealth () {
        return health;
    }
    
    public int getDamage () {
    return damage;
    }
    
    public int getShield () {
    return shield;
    }
    
    public int setHealth (int HP) {
      health = HP;
        return HP;
    }
    
    public void receiveDamage(int damage){
      health -= damage + shield;
      if (health  <= 0){
          System.out.println("Character has died.");
      }     
      
      
    }
    }
    
    
        
    


