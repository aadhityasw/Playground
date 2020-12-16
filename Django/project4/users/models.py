from django.db import models
from django.contrib.auth.models import AbstractUser

# Create your models here.

class CustomUser(AbstractUser):
    isStudent = models.BooleanField(default=False)
    isManager = models.BooleanField(default=True)

    def __str__(self):
        return self.username