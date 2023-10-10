package com.technews.repository;

import com.technews.model.Vote;
import jakarta.annotation.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
    @Query("SELECT count (*) FROM Vote v where v.postId = :id")
    int countVotesByPostId(@Param("id") Integer id);
}
