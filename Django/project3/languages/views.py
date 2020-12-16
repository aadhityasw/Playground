from django.shortcuts import render
from rest_framework import viewsets, permissions
from .models import Language, Paradgim, Programmer
from .serializers import LanguageSerializer, ParadgimSerializer, ProgrammerSerializer

class LanguageView(viewsets.ModelViewSet) :
    queryset = Language.objects.all()
    serializer_class = LanguageSerializer

class ParadgimView(viewsets.ModelViewSet) :
    queryset = Paradgim.objects.all()
    serializer_class = ParadgimSerializer

class ProgrammerView(viewsets.ModelViewSet) :
    queryset = Programmer.objects.all()
    serializer_class = ProgrammerSerializer