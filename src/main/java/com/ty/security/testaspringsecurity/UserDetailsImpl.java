package com.ty.security.testaspringsecurity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserDetailsImpl implements UserDetails {
	private User user;
	
	public UserDetailsImpl(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String[] roles = user.getRoles().split(",");
		List<GrantedAuthority> li = null;
		for(String role : roles) {
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role);
			li = new ArrayList<GrantedAuthority>();
			li.add(authority);
		}
		return li;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return user.getActive() != null && user.getActive().equalsIgnoreCase("ACTIVE");
	}

	@Override
	public boolean isAccountNonLocked() {
		return user.getActive() != null && user.getActive().equalsIgnoreCase("ACTIVE");
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return user.getActive() != null && user.getActive().equalsIgnoreCase("ACTIVE");
	}

	@Override
	public boolean isEnabled() {
		return user.getActive() != null && user.getActive().equalsIgnoreCase("ACTIVE");
	}

}
