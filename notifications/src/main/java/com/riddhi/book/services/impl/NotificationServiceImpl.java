package com.riddhi.book.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.riddhi.book.domain.Notification;
import com.riddhi.book.repositories.NotificationRepository;
import com.riddhi.book.services.NotificationsService;

@Service
public class NotificationServiceImpl implements NotificationsService {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(final NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification save(final Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public Page<Notification> listNotifications(final Pageable pageable) {
      return notificationRepository.findAll(pageable);
    }

}
