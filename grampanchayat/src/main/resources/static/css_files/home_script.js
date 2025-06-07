// Initialize carousel
        $(document).ready(function(){
            $('.carousel').carousel({
                interval: 5000,
                pause: "hover"
            });
            
            // Smooth scrolling for anchor links
            $('a[href*="#"]').on('click', function(e) {
                e.preventDefault();
                $('html, body').animate(
                    {
                        scrollTop: $($(this).attr('href')).offset().top,
                    },
                    500,
                    'linear'
                );
            });
            
            // Add animation classes when elements come into view
            $(window).scroll(function() {
                $('.feature-card, .services-box, .welcome-box').each(function() {
                    var position = $(this).offset().top;
                    var scroll = $(window).scrollTop();
                    var windowHeight = $(window).height();
                    
                    if (scroll + windowHeight > position + 100) {
                        $(this).addClass('fade-in');
                    }
                });
            });
            
            // Trigger scroll event on load to check initial positions
            $(window).trigger('scroll');
        });

