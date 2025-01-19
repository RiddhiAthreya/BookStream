package com.riddhi.book.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.riddhi.book.domain.Notification;

public interface NotificationRepository extends CrudRepository<Notification, Long>,
        PagingAndSortingRepository<Notification, Long> {
}
