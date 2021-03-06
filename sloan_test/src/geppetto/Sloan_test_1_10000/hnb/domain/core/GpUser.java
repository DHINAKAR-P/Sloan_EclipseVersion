package geppetto.Sloan_test_1_10000.hnb.domain.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



/**
 * 
 * @author Geppetto Generated Code</br>
 * Date Created: </br>
 * @since  </br>
 * build:   </p> 
 *
 * code was generated by the Geppetto System </br>
 * Gepppetto system Copyright - Geppetto LLC </br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/
public class GpUser implements UserDetails {


	/**
	*
	* For now this class is only used to make the compile succeed
	* and therefore it is not meant to be used 
	* 
	* When you are ready this class should follow the same rules as any other
	* Noun to start it should contain the following fields:
	*
	* firstName, lastName. password, userid, email, and a list of Roles
	* 
	* You should then allow the person using Geppetto to add more fields
	* to in the Noun editor -  Dan Castillo 01/28/2015
	*
	*
	*/



	public GpUser(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	private Long id = 0L;
	private String firstName;
	private String lastName;
	private String middleName;
	private String username;
	private String password;
	private String languagepreference;
	private String primaryemail;
	private String phonenumber;
	private String screenname;  //used for display only
	private Date startdate;
	private String licenseid;
	private Date lastaccess;
	private String mustresetpassword;
	private String accestype;		//used to disable access
    private Set<GpAuthority>  roles;
    private boolean newuser;  //typically used for registration

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Set<GpAuthority> getRoles() {
		return roles;
	}

	public void setRoles(Set<GpAuthority> roles) {
		this.roles = roles;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLanguagepreference() {
		return languagepreference;
	}

	public void setLanguagepreference(String languagepreference) {
		this.languagepreference = languagepreference;
	}

	public String getPrimaryemail() {
		return primaryemail;
	}

	public void setPrimaryemail(String primaryemail) {
		this.primaryemail = primaryemail;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getScreenname() {
		return screenname;
	}

	public void setScreenname(String screenname) {
		this.screenname = screenname;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public String getLicenseid() {
		return licenseid;
	}

	public void setLicenseid(String licenseid) {
		this.licenseid = licenseid;
	}

	public Date getLastaccess() {
		return lastaccess;
	}

	public void setLastaccess(Date lastaccess) {
		this.lastaccess = lastaccess;
	}

	public String getMustresetpassword() {
		return mustresetpassword;
	}

	public void setMustresetpassword(String mustresetpassword) {
		this.mustresetpassword = mustresetpassword;
	}

	public String getAccestype() {
		return accestype;
	}

	public void setAccestype(String accestype) {
		this.accestype = accestype;
	}

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
	      List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
          for (GpAuthority role : roles) {
              System.out.println("The roles is: " + role.getAuthority());  
        	  list.add(new SimpleGrantedAuthority(role.getAuthority()));
          }


          return list;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isNewuser() {
		return newuser;
	}

	public void setNewuser(boolean newuser) {
		this.newuser = newuser;
	}


}