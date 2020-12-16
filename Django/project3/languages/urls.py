from django.urls import include, path
from . import views
from rest_framework import routers

router = routers.DefaultRouter()
router.register('languages', views.LanguageView)
router.register('paradgim', views.ParadgimView)
router.register('programmer', views.ProgrammerView)

urlpatterns = [
    path('', include(router.urls))
]