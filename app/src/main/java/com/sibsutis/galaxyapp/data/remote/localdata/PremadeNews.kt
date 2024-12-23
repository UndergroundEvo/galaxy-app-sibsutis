package com.sibsutis.galaxyapp.data.remote.localdata

import com.sibsutis.galaxyapp.data.remote.dto.NewsDto


// unused
class PremadeNews() {
    val readyNews = listOf<NewsDto>(
        NewsDto(
            "Официант выдал котлету за элитный стейк: клиент в шоке!",
            "Когда ресторанный обман превращает ужин в скандал."
        ),
        NewsDto(
            "Мужчина 20 лет прятался от налогов под кроватью!",
            "Как крошечное укрытие спасло его от закона."
        ),

        NewsDto(
            "Забытый клад под ковром: бабушка нашла миллионы!",
            "Как старый ковёр может сделать вас миллионером."
        ),
        NewsDto(
            "Шок: попугай подслушал секреты правительства!",
            "Птица, которая знает слишком много."
        ),

        NewsDto(
            "Огурец взорвал кухню: повар чудом выжил!",
            "Обычный овощ стал причиной катастрофы."
        ),
        NewsDto(
            "Инопланетяне пробуют борщ: реакция вас удивит!",
            "Первое впечатление пришельцев от русской кухни."
        ),

        NewsDto(
            "Сосед украл Интернет и разбогател на майнинге биткоинов!",
            "Воровство Wi-Fi как способ стать миллионером."
        ),
        NewsDto(
            "Кот открыл собственный бизнес: и это не шутка!",
            "Четвероногий предприниматель рвёт рынок услуг."
        ),

        NewsDto(
            "Школьник случайно изобрёл вечный двигатель на уроке труда!",
            "Нобелевская премия за пятиминутный проект?"
        ),
        NewsDto(
            "Учёные нашли способ не спать всю неделю!",
            "Новое открытие переворачивает наш взгляд на сон."
        ),

        NewsDto(
            "Мать вышвырнула сына за игру в шахматы",
            "Скандальная драка из-за королевского хобби."
        ),
        NewsDto(
            "Девушка родила троих детей от пылесоса?!",
            "Правда, которую ты не ожидал услышать"
        ),

        NewsDto(
            "В Бийске снегоуборщик поехал на шашлыки!",
            "Город в шоке – водитель оставил работу ради мяса."
        ),
        NewsDto(
            "Новосибирец поймал Лох-Несское чудовище в Оби!",
            "Местные рыбаки подтверждают: это не мираж!"
        ),
    )

    fun makeLocalNews(): List<NewsDto> {
        return readyNews.shuffled()
    }
}