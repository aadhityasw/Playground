from rest_framework  import serializers
from .models import Language, Paradgim, Programmer

class LanguageSerializer(serializers.HyperlinkedModelSerializer) :
    class Meta :
        model = Language
        fields = ('id', 'url', 'name', 'paradgim')

class ParadgimSerializer(serializers.HyperlinkedModelSerializer) :
    class Meta :
        model = Paradgim
        fields = ('id', 'url', 'name')

class ProgrammerSerializer(serializers.HyperlinkedModelSerializer) :
    class Meta :
        model = Programmer
        fields = ('id', 'url', 'name', 'languages')