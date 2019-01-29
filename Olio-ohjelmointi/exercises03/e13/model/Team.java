package model;
import java.util.HashSet;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Team
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private Person[] players = new Person[20];

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String teamName;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Set<Person> person;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Team(String parameter){
		System.out.println("Team Created");
		teamName = parameter;
		//super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addPerson(Person parameter) {
		// TODO implement me

		for (int i = 0; i < players.length; i++) {
			if (players[i] == null) {
				System.out.println("set player to team");
				players[i] = parameter;
				break;
			}
			if (i == 19) {
				System.out.println("team is full");
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Person getTeam() {
		System.out.println("tiimissa on ukot : ");
		for (int i = 0; i < players.length; i++) {
			if (players[i] != null) {
				System.out.println( players[i].getName() );
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getTeamName() {
		// TODO implement me
		return teamName;
	}

	public void removePlayer(int parameter) {
		players[parameter] = null;
	}

}

