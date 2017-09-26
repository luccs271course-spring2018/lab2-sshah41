package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  //* Method for DRY exercise */
  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Head coach: " + headcoach);
    System.out.println("Funding: " + funding);
  }
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // TODO validity checking for headcoach done
     if(headcoach == null) {
      throw new IllegalArgumentException("headcoach is null");
    }
    // TODO validity checking for funding done
      if (funding == 0) {
      throw new IllegalArgumentException("funding is zero");
    }



    this.name = name;
    // Done complete this constructor
    this.headcoach= headcoach;
    this.funding=funding;
  }

  /** Returns the team's name. */
  public String getName() {
    return name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // Done complete this method
    return headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // Done complete this method
    return funding;
  }

}
