package com.github.diegogomesaraujo.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.github.diegogomesaraujo.entities.User;

@Repository
public interface UsersRepository extends PagingAndSortingRepository<User, Long> {

}
