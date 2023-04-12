package com.example.springjpaqlelementcollection.idea235141;

import jakarta.persistence.*;
import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "REPORT")
public class Report {
    @Id
    @GeneratedValue
    private long id;

    @Lob
    @Column(name = "CONTENT")
    private String reportContent;

    @Lob
    @ElementCollection
    @CollectionTable(name = "SUB_REPORTS", joinColumns = @JoinColumn(name = "SUB_RPT_FK"))
    @Column(name = "SUB_CONTENT")
    private List<String> subReportContents;

    @Lob
    @Column(name = "IMAGE")
    private byte[] reportImage;

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public List<String> getSubReportContents() {
        return subReportContents;
    }

    public void setSubReportContents(List<String> subReportContents) {
        this.subReportContents = subReportContents;
    }

    public byte[] getReportImage() {
        return reportImage;
    }

    public void setReportImage(byte[] reportImage) {
        this.reportImage = reportImage;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reportContent='" + reportContent + '\'' +
                ", subReportContents=" + subReportContents +
                ", reportImage=" + Arrays.toString(reportImage) +
                '}';
    }
}