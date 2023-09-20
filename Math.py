{
  "nbformat": 4,
  "nbformat_minor": 0,
  "metadata": {
    "colab": {
      "provenance": [],
      "authorship_tag": "ABX9TyN/VMvwg5xYH3u1hKrT2UWo"
    },
    "kernelspec": {
      "name": "python3",
      "display_name": "Python 3"
    },
    "language_info": {
      "name": "python"
    }
  },
  "cells": [
    {
      "cell_type": "code",
      "execution_count": 10,
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "2Rp2wAecWDk7",
        "outputId": "4e35f387-54bd-414e-e67e-7993db80e751"
      },
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Primeira nota do aluno: 2\n",
            "Segunda nota do aluno: 9\n",
            "A média entre 2.0 e 9.0 é igual a 5.5\n"
          ]
        }
      ],
      "source": [
        "#MédiaAritmética\n",
        "n1 = float(input('Primeira nota do aluno: '))\n",
        "n2 = float(input('Segunda nota do aluno: '))\n",
        "media = (n1 + n2)/ 2\n",
        "print('A média entre {} e {} é igual a {}'.format(n1, n2, media))"
      ]
    },
    {
      "cell_type": "code",
      "source": [
        "#ConversorDeTabuadas\n",
        "medida = float(input('Uma distancia em metros: '))\n",
        "cm = medida * 100\n",
        "mm = medida * 1000\n",
        "print('A media de {}m corrresponde a {:.0f}cm e {:.0f}mm'.format(medida, cm, mm))"
      ],
      "metadata": {
        "colab": {
          "base_uri": "https://localhost:8080/"
        },
        "id": "guWBwFwPmpDV",
        "outputId": "c8c4f6cd-71e6-4386-a075-4eb5301fb9f5"
      },
      "execution_count": 11,
      "outputs": [
        {
          "output_type": "stream",
          "name": "stdout",
          "text": [
            "Uma distancia em metros: 10\n",
            "A media de 10.0m corrresponde a 1000.0cm e 10000.0mm\n"
          ]
        }
      ]
    }
  ]
}