# Generated by Django 2.2.1 on 2019-09-18 12:29

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('music', '0002_song_is_favorite'),
    ]

    operations = [
        migrations.RemoveField(
            model_name='song',
            name='is_favorite',
        ),
    ]
