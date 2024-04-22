package com.levi.statsapi.controller;

import com.levi.statsapi.dto.Report.ReportsResponseDTO;
import com.levi.statsapi.service.ReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/report")
public class ReportController {

    private final ReportService reportService;

    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping
    public ResponseEntity<ReportsResponseDTO> getReports() {
        return ResponseEntity.ok(this.reportService.getAllReports());
    }
}
