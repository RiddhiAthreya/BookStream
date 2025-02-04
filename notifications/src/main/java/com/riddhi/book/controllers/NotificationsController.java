package com.riddhi.book.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riddhi.book.domain.Notification;
import com.riddhi.book.services.NotificationsService;

@RestController
public class NotificationsController {

    private final NotificationsService notificationsService;

    public NotificationsController(NotificationsService notificationsService) {
        this.notificationsService = notificationsService;
    }

    @GetMapping(path="/notifications")
    public Page<Notification> listNotifications(final Pageable pagable) {
        return notificationsService.listNotifications(pagable);
    }

}
