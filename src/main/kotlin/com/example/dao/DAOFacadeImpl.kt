package com.example.dao

import com.example.models.Article

class DAOFacadeImpl : DAOFacade {
    override suspend fun allArticles(): List<Article> {
        TODO("Not yet implemented")
    }

    override suspend fun article(id: Int): Article? {
        TODO("Not yet implemented")
    }

    override suspend fun addNewArticle(title: String, body: String): Article? {
        TODO("Not yet implemented")
    }

    override suspend fun editArticle(id: Int, title: String, body: String): Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun deleteArticle(id: Int): Boolean {
        TODO("Not yet implemented")
    }
}