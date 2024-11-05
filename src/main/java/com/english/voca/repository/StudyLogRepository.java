package com.english.voca.repository;

import com.english.voca.domain.StudyLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudyLogRepository extends JpaRepository<StudyLog, Long> {

	List<StudyLog> findByOnlyBookMarkAndShuffle(boolean onlyBookMark, boolean shuffle);

	// TODO: 2024-12-03 @Modifying 사용해야하는지?
	// TODO: 2024-12-03 리턴값은 없어도 되는지?
	void deleteByOnlyBookMarkAndShuffle(boolean onlyBookMark, boolean shuffle);

	StudyLog findByOnlyBookMarkAndShuffleAndNowStudying(boolean onlyBookMark, boolean shuffle, boolean nowStudying);
}
