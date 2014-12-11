package com.PL.Spring.DAO;

import java.util.List;

import com.PL.Spring.Entities.Document;

public interface DocumentDaoInt {
	
	void addDocument(Document doc);
	void editDocument(Document doc);
	void deleteLDocument(Long docID);
	Document findDocument(Long docID);
	Document findDocumentByTitle(String nomdoc);
	List<Document> getAllDocuments();

}
