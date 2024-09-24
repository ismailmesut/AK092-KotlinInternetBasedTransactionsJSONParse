package com.ismailmesutmujde.kotlininternetbasedtransactionsjsonparse

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // this result was taken from here: http://kasimadalan.pe.hu/bayrak/tum_bayraklar.php
        val jsonFlagsResult = "{\"bayraklar\":[{\"bayrak_id\":\"1\",\"bayrak_ad\":\"T\\u00fcrkiye\",\"bayrak_resim\":\"turkiye\"},{\"bayrak_id\":\"2\",\"bayrak_ad\":\"Almanya\",\"bayrak_resim\":\"almanya\"},{\"bayrak_id\":\"3\",\"bayrak_ad\":\"\\u0130talya\",\"bayrak_resim\":\"italya\"},{\"bayrak_id\":\"4\",\"bayrak_ad\":\"Fransa\",\"bayrak_resim\":\"fransa\"},{\"bayrak_id\":\"5\",\"bayrak_ad\":\"Hollanda\",\"bayrak_resim\":\"hollanda\"},{\"bayrak_id\":\"6\",\"bayrak_ad\":\"\\u0130spanya\",\"bayrak_resim\":\"ispanya\"},{\"bayrak_id\":\"7\",\"bayrak_ad\":\"Slovenya\",\"bayrak_resim\":\"slovenya\"},{\"bayrak_id\":\"8\",\"bayrak_ad\":\"Slovakya\",\"bayrak_resim\":\"slovakya\"},{\"bayrak_id\":\"9\",\"bayrak_ad\":\"Estonya\",\"bayrak_resim\":\"estonya\"},{\"bayrak_id\":\"10\",\"bayrak_ad\":\"Rusya\",\"bayrak_resim\":\"rusya\"},{\"bayrak_id\":\"11\",\"bayrak_ad\":\"Bulgaristan\",\"bayrak_resim\":\"bulgaristan\"},{\"bayrak_id\":\"12\",\"bayrak_ad\":\"Romanya\",\"bayrak_resim\":\"romanya\"},{\"bayrak_id\":\"13\",\"bayrak_ad\":\"Norve\\u00e7\",\"bayrak_resim\":\"norvec\"},{\"bayrak_id\":\"14\",\"bayrak_ad\":\"Yunanistan\",\"bayrak_resim\":\"yunanistan\"},{\"bayrak_id\":\"15\",\"bayrak_ad\":\"Bosna Hersek\",\"bayrak_resim\":\"bosnahersek\"}],\"success\":1}"

        try {
            val jsonObject = JSONObject(jsonFlagsResult)
            val flagsList = jsonObject.getJSONArray("bayraklar")

            for (i in 0 until flagsList.length()) {

                val f = flagsList.getJSONObject(i)

                val flag_id = f.getInt("bayrak_id")
                val flag_name = f.getString("bayrak_ad")
                val flag_image = f.getString("bayrak_resim")

                Log.e("***************","***************")
                Log.e("flag_id", flag_id.toString())
                Log.e("flag_name", flag_name)
                Log.e("flag_image",flag_image)
                Log.e("***************","***************")
            }

        } catch (e:Exception) {
            e.printStackTrace()
        }

        // this result was taken from here: http://kasimadalan.pe.hu/filmler/tum_filmler.php
        val jsonMoviesResult = "{\"filmler\":[{\"film_id\":\"1\",\"film_ad\":\"Interstellar\",\"film_yil\":\"2015\",\"film_resim\":\"interstellar.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"2\",\"film_ad\":\"Inception\",\"film_yil\":\"2010\",\"film_resim\":\"inception.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"3\",\"film_ad\":\"The Pianist\",\"film_yil\":\"2002\",\"film_resim\":\"thepianist.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"4\",\"yonetmen_ad\":\"Roman Polanski\"}},{\"film_id\":\"4\",\"film_ad\":\"Anadoluda\",\"film_yil\":\"2011\",\"film_resim\":\"birzamanlaranadoluda.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"3\",\"yonetmen_ad\":\"Nuri Bilge Ceylan\"}},{\"film_id\":\"5\",\"film_ad\":\"The Hateful Eight\",\"film_yil\":\"2015\",\"film_resim\":\"thehatefuleight.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}},{\"film_id\":\"18\",\"film_ad\":\"Django\",\"film_yil\":\"2013\",\"film_resim\":\"django.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}}],\"success\":1}"

        try {
            val jsonObject = JSONObject(jsonMoviesResult)
            val moviesList = jsonObject.getJSONArray("filmler")

            for (i in 0 until moviesList.length()) {

                val m = moviesList.getJSONObject(i)

                val movie_id = m.getInt("film_id")
                val movie_name = m.getString("film_ad")
                val movie_year = m.getInt("film_yil")
                val movie_poster = m.getString("film_resim")

                val category = m.getJSONObject("kategori")
                val category_id = category.getInt("kategori_id")
                val category_name = category.getString("kategori_ad")

                val director = m.getJSONObject("yonetmen")
                val director_id = director.getInt("yonetmen_id")
                val director_name = director.getString("yonetmen_ad")

                Log.e("***************","***************")
                Log.e("movie_id", movie_id.toString())
                Log.e("movie_name", movie_name)
                Log.e("movie_year", movie_year.toString())
                Log.e("movie_poster", movie_poster)
                Log.e("category_id", category_id.toString())
                Log.e("category_name", category_name)
                Log.e("director_id", director_id.toString())
                Log.e("director_name", director_name)
                Log.e("***************","***************")
            }



        } catch (e:java.lang.Exception) {
            e.printStackTrace()
        }
    }
}