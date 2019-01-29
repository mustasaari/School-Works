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
	
	private Person[] players;

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
		players = new Person[0];
		//super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addPerson(Person parameter) {
		boolean added = false;

		for (int i = 0; i < players.length; i++) {	//jos taulukon alkupäässä tilaa niin lisää sinne
			if (players[i] == null) {
				players[i] = parameter;
				added = true;
				break;
			}
		}

		if ( added == false ) {	//jos ei mahdu kasvatetaan taulukkoa

			// TODO implement me
			Person[] tmpArray = new Person[players.length + 1];
			System.out.println("Uuden taulukon koko on : " +tmpArray.length );
			for (int i = 0; i < players.length ; i++) {
				tmpArray[i] = players[i];
			}
			tmpArray[players.length] = parameter;
			players = new Person[tmpArray.length];
			players = tmpArray;
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

